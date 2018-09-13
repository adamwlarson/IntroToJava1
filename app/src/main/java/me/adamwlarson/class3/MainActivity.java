package me.adamwlarson.class3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }

    public void onCalculate(View view) {
        EditText eText = (EditText)findViewById(R.id.year);
        TextView tView = (TextView)findViewById(R.id.answer);
        String enteredYear = eText.getText().toString();
        int year = Integer.parseInt(enteredYear);
        tView.setText(Integer.toString(centuryFromYear(year)));
    }

 private int centuryFromYear(int year) {
	      if(year >= 2000) {
	    	  System.out.print("20");
	      }else {
	    	  if(year >= 1900) {
	    		  System.out.print("19");
	    	  }else {
	    		  if(year >= 1800) {
	    			  System.out.print("18");
	    		  }else {
	    			  if(year >= 1700) {
	    				  System.out.print("17");
	    			  }else {
	    				  if(year >= 1600) {
	    					  System.out.print("16");
	    				  }else {
	    					  if(year >= 1500) {
	    						  System.out.print("15");
	    					  }else {
	    						  if(year >= 1400) {
	    							  System.out.print("14");
		    					  }else {
		    						  if(year >= 1300) {
		    							  System.out.print("13");
			    					  }else {
			    						  if(year >= 1200) {
			    							  System.out.print("12");
				    					  }else{
				    						  if(year >= 1100) {
				    							  System.out.print("11");
					    					  }else {
					    						  if(year >= 1000) {
					    							  System.out.print("10");
						    					  }else {
						    						  if(year >= 900) {
						    							  System.out.print("9");
							    					  }else {
							    						  if(year >= 800) {
							    							  System.out.print("8");
								    					  }else {
								    						  if(year >= 700) {
								    							  System.out.print("7");
									    					  }else {
									    						  if(year >= 600) {
									    							  System.out.print("6");
										    					  }else {
										    						  if(year >= 500) {
										    							  System.out.print("5");
											    					  }else {
											    						  if(year >= 400) {
											    							  System.out.print("4");
												    					  }else {
												    						  if(year >= 300) {
												    							  System.out.print("3");
													    					  }else {
													    						  if(year >= 200) {
													    							  System.out.print("2");
														    					  }else {
														    						  if(year >= 100) {
														    							  System.out.print("1");
															    					  }else {
															    						  System.out.print("0");
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
	      }
	    }
	}

}

