package com.vikey;

import java.util.HashSet;
import java.util.Set;

/**
 * ������
 * @author qyq
 *
 */
public class MathUtil {
	
	/**
	 * չʾ������
	 * @param start ���뿪ʼ����ֵ
	 * @param end �����������ֵ
	 * @return
	 */
	public String showResult(int start, int end){
		if(start<0||end>99){
			System.out.println("��ֵ�������㷶Χ");
			return null;
		}
		StringBuffer sb=new StringBuffer();
		for (int i = start; i <= end; i++) {
			int temp=i+1;
			sb.append(getTwoNumResult(i, temp));
			sb.append(" ");
			if(temp==end){
				//��ֵ��ͷ�ˣ�Ҫ�˳�ѭ��
				break;
			}
		}
		
		return sb.toString().trim();
		
	}
	
	
	
	/**
	 * ��ȡ�κ��������ֵ���ĸ������Ͻ��
	 * @param num1 ����1
	 * @param num2 ����2
	 * @return �����������ֵ���ĸ�������
	 */
	@SuppressWarnings("unchecked")
	public String getTwoNumResult(int num1, int num2) {
		StringBuffer sb = new StringBuffer();
		String str1 = getNumVal(num1);
		String str2 = getNumVal(num2);
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();

		@SuppressWarnings("rawtypes")
		Set set = new HashSet();
		if (charArr1.length > 0 && charArr2.length > 0) {
			for (int i = 0; i < charArr1.length; i++) {
				for (int j = 0; j < charArr2.length; j++) {
					String temp = String.valueOf(charArr1[i])
							+ String.valueOf(charArr2[j]);
					if (!set.contains(temp)) {
						sb.append(temp);
						sb.append(" ");
						set.add(temp);
					}
				}
				
			}
		} else if (charArr1.length > 0 && charArr2.length == 0) {
			for (int i = 0; i < charArr1.length; i++) {
				char tempChar = charArr1[i];
				if (!set.contains(tempChar)) {
					String temp = String.valueOf(charArr1[i]);
					sb.append(temp);
					sb.append(" ");
					set.add(tempChar);
				}
			}
		} else if (charArr2.length > 0 && charArr1.length == 0) {
			for (int j = 0; j < charArr2.length; j++) {
				char tempChar = charArr2[j];
				if (!set.contains(tempChar)) {
					String temp = String.valueOf(charArr2[j]);
					sb.append(temp);
					sb.append(" ");
					set.add(tempChar);
				}
			}
		}
		if(sb.length()>0){
			sb.delete(sb.length()-1, sb.length());
		}
		return sb.toString();
	}
	
	/**
	 * ��ȡ0��99��Ӧ����ĸ
	 * @param num �������ֵ
	 * @return ���ض�Ӧ����ĸ
	 */
	public String getNumVal(int num) {
		// ����ת�����ַ�
		String strNum = String.valueOf(num);
		if (num >= 10 && num <= 99) {
			//���ַ�����λ�������ַ����
			char[] charArr = strNum.toCharArray();
			String firstStr = String.valueOf(charArr[0]);
			String secStr = String.valueOf(charArr[1]);
			return getNumLetters(Integer.parseInt(firstStr))
					+ getNumLetters(Integer.parseInt(secStr));
		} else if (num < 10) {
			//���ַ���һλ����ֱ�ӷ��ض�Ӧ����ĸ
			return getNumLetters(num);
		}else{
			System.out.println("��ֵ�������㷶Χ");
		}
		return null;
	}
	
	/*************************************������˽�з���********************************************/

	/**
	 * ��ȡ0��9ÿ�����ֶ�Ӧ����ĸ
	 * @param key ����
	 * @return ��Ӧ����ĸ�ַ���
	 */
	private String getNumLetters(int num) {
		String value = "";
		switch (num) {
		case 0:
			value = "";
			break;
		case 1:
			value = "";
			break;
		case 2:
			value = "abc";
			break;
		case 3:
			value = "def";
			break;
		case 4:
			value = "ghi";
			break;
		case 5:
			value = "jkl";
			break;
		case 6:
			value = "mno";
			break;
		case 7:
			value = "pqrs";
			break;
		case 8:
			value = "tuv";
			break;
		case 9:
			value = "wxyz";
			break;
		default:
			break;
		}
		return value;
	}

	
	
	

}
