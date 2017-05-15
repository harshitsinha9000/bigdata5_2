import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;


public class Reducer52 extends Reducer<Text,IntWritable,Text,IntWritable>
{

	@Override
	protected void reduce(Text value,Iterable<IntWritable> values,Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		int count=0;
		String key = "Total sales for "+value.toString()+" is"; 
		
		key=key+" "+value.toString();
		
		for(IntWritable value1 : values)
		{
			count = count + value1.get(); 
		}
		
		context.write(new Text(key),new IntWritable(count));
		
		
	}

	
	

}
