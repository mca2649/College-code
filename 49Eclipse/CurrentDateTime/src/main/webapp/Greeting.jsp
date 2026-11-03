<%! 
    int hour;
%>

<HTML>
    <BODY>
    		<%
    		//get current hour
    		hour = java.time.LocalTime.now().getHour();
			if(hour <12)
			{
				out.println("Good Morning!!");
			}
			else if(hour >= 12 && hour < 16)
			{
				out.println("Good Afernoon!!");
			}
			else
			{
				out.println("Good Evening!!");
			}
			
    		%>
    </BODY>
</HTML>