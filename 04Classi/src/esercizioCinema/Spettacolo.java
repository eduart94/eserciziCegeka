package esercizioCinema;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Spettacolo 
{
	private int id;
	private String titolo;
	private Date data;
	
	DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	
	public Spettacolo(int _id, String _titolo, String _data)
	{
		this.id = _id;
		this.titolo = _titolo;
		try 
		{
			this.data = sdf.parse(_data); 
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void setData(Date _data) 
	{
		this.data = _data;
	}
	
	public void setDataDaStringa(String data)
	{
		try {
			this.data = sdf.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public Date getData() 
	{
		return this.data;
	}
	
	public String getDataStringa()
	{
		String data = sdf.format(this.data);
		return data;
	}
	
	public String getTitolo()
	{
		return this.titolo;
	}
}
