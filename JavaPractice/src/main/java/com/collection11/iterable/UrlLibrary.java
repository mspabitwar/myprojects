package com.collection11.iterable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {

	private LinkedList<String> urls = new LinkedList<>();

	private class UrlIterator implements Iterator<String> {

		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < urls.size();
		}

		@Override
		public String next() {
			StringBuilder sb = new StringBuilder();
			try {
				URL url = new URL(urls.get(index));
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				String line = null;
				while ((line = br.readLine()) != null) {
					sb.append(line);
					sb.append("\n");
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			index++;
			return sb.toString();
		}

	}

	public UrlLibrary() {
		urls.add("https://www.google.com");
		urls.add("https://www.facebook.com");
		urls.add("https://www.gmail.com");
	}

	/*
	 * @Override public Iterator<String> iterator() { return urls.iterator(); }
	 */

	@Override
	public Iterator<String> iterator() {
		return new UrlIterator();
	}
}
