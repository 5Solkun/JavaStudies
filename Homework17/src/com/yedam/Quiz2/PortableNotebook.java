package com.yedam.Quiz2;

public class PortableNotebook implements Notebook, Table {
	String prog;
	String browser;
	String cat;
	String app;
	int mode = NOTEBOOK_MODE;

	public PortableNotebook(String prog, String browser, String cat, String app) {
		this.prog = prog;
		this.browser = browser;
		this.cat = cat;
		this.app = app;
		if (mode == NOTEBOOK_MODE) {
			System.out.println("NOTEBOOK_MODE");
		}else {
			System.out.println("TABLET_MODE");
		}
	}

	@Override
	public void watchVideo() {
		// TODO Auto-generated method stub
		System.out.println(cat + "를 시청");
	}

	@Override
	public void useApp() {
		// TODO Auto-generated method stub
		if (mode == TABLET_MODE) {
			mode= NOTEBOOK_MODE;
			System.out.println("NOTEBOOK_MODE");
		}else {
			mode=TABLET_MODE;
			System.out.println("TABLET_MODE");
		}
		System.out.println(app+"앱을 실행");
	}

	@Override
	public void writeDocumentaion() {
		// TODO Auto-generated method stub
		System.out.println(prog + "을 통해 문서를 작성");

	}

	@Override
	public void searchInternet() {
		// TODO Auto-generated method stub
		System.out.println(browser + "을 통해 인터넷을 검색");

	}

}
