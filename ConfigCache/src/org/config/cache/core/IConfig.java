package org.config.cache.core;

import org.config.cache.StringArray;

/**
 * ���������඼��Ҫʵ�ָýӿ�
 * 
 * ͬʱ�����������඼ֻ����ӵ��int(Integer),long(Long),float(Float),double(Double),String,�������͵�����
 * 
 * ���ʹ��DefaultJsonDecoder,�����е����Ա���ʹ�ö������ͣ���������int,��ʹ��Integer��������ͬ
 * 
 * ÿ������ʵ���������id����
 * ÿ������ʵ�������ӵ��getter��setter����
 * @author chenjie
 * 2012-12-5
 */
public interface IConfig {
	
	/**
	 * ��values�н�������ת������ֵ
	 * @param values
	 */
	public void fromStringArray(StringArray values);
	public String getKey();
	

}