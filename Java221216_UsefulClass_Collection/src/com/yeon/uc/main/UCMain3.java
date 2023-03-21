package com.yeon.uc.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

import com.yeon.uc.subway.StationInfo;

// 가장 이용객수 (탄+내린)가 많았던 지하철
// 2015.01.01(요일) 1호선 서울역 탄사람 내린사람

//운행정보들 list계열에 넣기

public class UCMain3 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\seoyeon\\Program\\subway3.csv");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);

			String line = null;
			ArrayList<StationInfo> al = new ArrayList<>();

			while ((line = br.readLine()) != null) {
				al.add(new StationInfo(line));

			}
			//정렬
			al.sort(new Comparator<StationInfo>() {
				@Override
				public int compare(StationInfo o1, StationInfo o2) {
					Double o1Sum = o1.getRide() + o1.getAlight();
					Double o2Sum = o2.getRide() + o2.getAlight();
					return o2Sum.compareTo(o1Sum);
				}
			});
			al.get(0).printInfo();

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
