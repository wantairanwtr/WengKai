package xunhuankongzhi;

public class Zhipai {
	public static void main(String[]args) {
		double p=54;
		OUT:for(int A=0;A<=p/13.5;A++) {
			for(int two=0;two<=p/13.5;two++) {
				for(int three=0;three<=p/13.5;three++) {
					for(int four=0;four<=p/13.5;four++) {
						for(int five=0;five<=p/13.5;five++) {
							for(int six=0;six<=p/13.5;six++) {
								for(int seven=0;seven<=p/13.5;seven++) {
									for(int eight=0;eight<=p/13.5;eight++) {
										for(int nine=0;nine<=p/13.5;nine++) {
											for(int ten=0;ten<=p/13.5;ten++) {
												for(int J=0;J<=p/13.5;J++) {
													for(int Q=0;Q<=p/13.5;Q++) {
														for(int K=0;K<=p/13.5;K++) {
															for(int xw=0;xw<=p/54;xw++) {
																for(int dw=0;dw<=p/54;dw++) {
																	if(4*A+4*two+4*three+4*four+4*five+4*six+4*seven+4*eight+4*nine+4*ten+4*J+4*Q+4*K+xw+dw==p) {
																		System.out.println(A+"��A,"+two+"��2,"+three+"��3,"+four+"��4,"+five+"��5,"+six+"��6,"+seven+"��7,"+eight+"��8,"+nine+"��9,"+ten+"��10,"+J+"��J,"+Q+"��Q,"+K+"��K,"+xw+"��С��,"+dw+"�Ŵ���,");
																		break OUT;
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
