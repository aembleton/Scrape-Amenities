package net.blerg.scrapeAmenities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import net.blerg.scrapeAmenities.proto.Osmformat;
import net.blerg.scrapeAmenities.proto.Osmformat.Node;
import net.blerg.scrapeAmenities.proto.Osmformat.PrimitiveBlock;
import net.blerg.scrapeAmenities.proto.Osmformat.PrimitiveGroup;

public class Scrape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PrimitiveBlock primitiveBlock = PrimitiveBlock.parseFrom(new FileInputStream(args[0]));
			
			
			
			Node nodes = Node.parseFrom(new FileInputStream(args[0]));
			
			for (Node node:nodes.get)
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
