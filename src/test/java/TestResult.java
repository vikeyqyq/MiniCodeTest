import org.junit.Assert;
import org.junit.Test;

import com.vikey.MathUtil;

/**
 * ��Ԫ������
 * @author qyq
 *
 */
public class TestResult {
	
	@Test
	public void testResult(){
		
		MathUtil mathUtil=new MathUtil();
		
		//��֤1�Ƿ���ĸ�Ƿ��Ӧ
		Assert.assertEquals(mathUtil.getNumVal(1), "");
		//��֤9�Ƿ���ĸ�Ƿ��Ӧ
		Assert.assertEquals(mathUtil.getNumVal(9), "wxyz");
		//��֤22�Ƿ���ĸ�Ƿ��Ӧ
		Assert.assertEquals(mathUtil.getNumVal(22), "abcabc");
		//��֤99�Ƿ���ĸ�Ƿ��Ӧ
		Assert.assertEquals(mathUtil.getNumVal(99), "wxyzwxyz");
		//��֤10�Ƿ���ĸ�Ƿ��Ӧ
		Assert.assertEquals(mathUtil.getNumVal(10), "");
		
		
		//��֤0,1���������
		Assert.assertEquals(mathUtil.getTwoNumResult(0, 1), "");
		//��֤10,11���������
		Assert.assertEquals(mathUtil.getTwoNumResult(10, 11), "");
		//��֤10,99���������
		Assert.assertEquals(mathUtil.getTwoNumResult(10, 99), "w x y z");
		//��֤45,89���������
		Assert.assertEquals(mathUtil.getTwoNumResult(45, 89), 
				"gt gu gv gw gx gy gz ht hu hv hw hx hy hz it iu iv iw ix iy iz jt ju jv jw jx jy jz kt ku kv kw kx ky kz lt lu lv lw lx ly lz");
		//��֤22,33���������
		Assert.assertEquals(mathUtil.getTwoNumResult(22, 33), 
						"ad ae af bd be bf cd ce cf");
		
		
		//��֤0��2���������
		Assert.assertEquals(mathUtil.showResult(0, 2), 
				"a b c");
		//��֤7��9���������
		Assert.assertEquals(mathUtil.showResult(7, 9), 
				"pt pu pv qt qu qv rt ru rv st su sv tw tx ty tz uw ux uy uz vw vx vy vz");
		//��֤������Χʱ�Ƿ�Ϊ��
		Assert.assertNull(mathUtil.showResult(0, 100));
				
		
		
	}

}
