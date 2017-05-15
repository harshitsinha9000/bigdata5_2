import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;

public class CompanyProduct implements WritableComparable {
	
	private String Company;
	private String Product;
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	public CompanyProduct(String Company,String Product)
	{
		Company=this.Company;
		Product=this.Product;
	}
	
	
	public String getCompany() {
		return Company;
	}


	public String getProduct() {
		return Company;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Company+""+Product;
	}


	public void set(String Company,String Product) {
		Product = this.Product;
		Company = this.Company; 
	}


	@Override
	public void readFields(DataInput in) throws IOException {
		// TODO Auto-generated method stub
		Company=in.readLine();
		Product=in.readLine();
	}

	@Override
	public void write(DataOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeChars(Company);
		out.writeChars(Product);
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		CompanyProduct cp = (CompanyProduct)o; 
		int comparevalue = this.Company.compareTo(cp.Company);
		if(comparevalue==0)
		{
			comparevalue =this.Product.compareTo(cp.Product);
		}
		return -1*comparevalue;
	}


	
	

}
