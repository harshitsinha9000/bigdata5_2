import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class Partitioner52 extends Partitioner<Text,IntWritable> {



	@Override
	public int getPartition(Text key, IntWritable value, int numreducetasks) 
	{
		// TODO Auto-generated method stub
		if(numreducetasks==0)
		return 0;
		else
		return (key.toString().hashCode()%numreducetasks);
		
	}

	
}
