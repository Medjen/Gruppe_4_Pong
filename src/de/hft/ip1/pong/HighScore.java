package de.hft.ip1.pong;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.table.AbstractTableModel;

import static de.hft.ip1.pong.Application.BASEFOLDER;

public class HighScore extends AbstractTableModel {
	private String[] columns = { "Platz", "Name", "Punkte" };
	private String[][] rows;
	private int rowCount;

	public HighScore() {

		File dir = new File(BASEFOLDER);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(BASEFOLDER + "/highscores.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (InputStream in = new FileInputStream(file);
				BufferedReader reader = new BufferedReader(new InputStreamReader(in, "ISO-8859-1"));) {
			ArrayList<Integer> points = new ArrayList<>();
			ArrayList<String> names = new ArrayList<>();
			reader.lines().forEach(e -> {
				if (e.contains(";")) {
					this.rowCount++;
					String[] fields = e.split(";");
					names.add(fields[0]);
					points.add(Integer.parseInt(fields[1]));
				}
			});

			rows = new String[rowCount][columns.length];

			for (int i = 0; i < points.size(); i++) {
				rows[i][2] = "" + points.get(i);
				rows[i][1] = "" + names.get(i);
			}

			Arrays.sort(rows, (a, b) -> Integer.compare(Integer.parseInt(b[2]), Integer.parseInt(a[2])));

			int i = 1;
			for (String[] myArray : rows) {
				myArray[0] = "" + i;
				i++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String[] getColumns() {
		return columns;
	}

	public void setColumns(String[] columns) {
		this.columns = columns;
	}

	@Override
	public int getColumnCount() {
		return columns.length;
	}

	@Override
	public int getRowCount() {
		return rows.length;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		return rows[arg0][arg1];
	}
	
	@Override
	public String getColumnName(int col) {
	    return columns[col];
	}
}
