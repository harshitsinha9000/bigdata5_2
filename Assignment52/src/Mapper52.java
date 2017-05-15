import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.*; 

public class Mapper52 extends Mapper<LongWritable, Text,Text,IntWritable> {
	public void map(LongWritable key, Text value,Context context) 
			throws IOException, InterruptedException {
		String[] lineArray = value.toString().split("|");
		String NA = new String("NA");
		
		CompanyProduct cp = new CompanyProduct(lineArray[0],lineArray[1]); 
	
		
		if(!((lineArray[0].equalsIgnoreCase(NA))||(lineArray[1].equalsIgnoreCase(NA))))
		{
			context.write(new Text(cp.toString()),new IntWritable(1));
			
		}
		
	}
}
