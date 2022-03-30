
package com.develogment.sod.ui.util;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;


public class ReadPdf
{

	public static void main(final String[] args) throws IOException
	{

		final PDDocument          document      = PDDocument.load(new File(""));
		final PDPage              page          = document.getPage(0);
		final PDPageContentStream contentStream =
			new PDPageContentStream(document, page, PDPageContentStream.AppendMode.APPEND, true, true);
		contentStream.beginText();

		// Setting the font
		contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

		// Setting the text position
		contentStream.newLineAtOffset(25, 500);

		final String text = "This message is writtern to the pdf file.";
		contentStream.showText(text);
		contentStream.endText();
		contentStream.close();
		// Saving file after writing
		document.save(new File("test.pdf"));
		document.close();

	}
}
