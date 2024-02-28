/*Consider The Research and Analysis Wing (RAW)is the foreign intelligence agency of 
India. It is under the authority of the Prime Minister of India without parliamentary 
oversight.Secretary reports to the National Security Adviser on a daily basis including 
new tasks to be performed. Create a "RAWAgent" class which will have complete details 
of RAM agents information such as RawAgentBatchId-, RawAgent CodeName, RawAgent 
MissionName which are highly confidential information.
1)Create "IndianSecretUnit" to control all the RAW agents
2)Allow "IndianSecretUnit" to have atleast 5 RAWAgents
3) Make sure IndianSecretUnit to assign new tasks to RAW agents by changing 
their details into new Mission
4) Print all the RAW agents details assigned before then modify the details 
for new Mission and allow IndianSecretUnit print updated details
*/
class RAWAgent
{
	private String rawAgentBatchId;
    private String rawAgentCodeName;
    private String rawAgentMissionName;
	
	//getter and setter for the rawAgentBatchId
	public String getrawAgentBatchId()
	{
		return rawAgentBatchId;
	}
	public void setrawAgentBatchId(String rawAgentBatchId)
	{
		this.rawAgentBatchId=rawAgentBatchId;
	}
	//getter and setter for the rawAgentCodeName 
	public String getrawAgentCodeName()// to get the data
	{
		return rawAgentCodeName;
	}
	public void setrawAgentCodeName(String rawAgentCodeName)// to set the data
	{
		this.rawAgentCodeName=rawAgentCodeName;
	}
	//getter and setter for the rawAgentMissionName
	public String getrawAgentMissionName()  //to get the data 
	{
		return rawAgentMissionName;
	}
	public void setrawAgentMissionName(String rawAgentMissionName) // to set the data
	{
		this.rawAgentMissionName=rawAgentMissionName;
	}

	//  method to print the agent details 
	public void PrintDetails()
	{
		System.out.println("RAW Agent batch ID: "+rawAgentBatchId);

		System.out.println("RAW Agent code Name: "+rawAgentCodeName);

		System.out.println("RAW Agent mission name:"+rawAgentMissionName);
	}

     // constructor  
	 RAWAgent(String rawAgentBatchId, String rawAgentCodeName, String rawAgentMissionName)
	{
        this.rawAgentBatchId = rawAgentBatchId;
        this.rawAgentCodeName = rawAgentCodeName;
        this.rawAgentMissionName = rawAgentMissionName;
    }
}
//Driver Class 
class IndianSecretUnit
{
	public static void main(String[] args) 
	{
		//RAWAgent ref1=new RAWAgent();
		RAWAgent ref1 = new RAWAgent("A001", "Agent JACK", "Operation AGNI");
		ref1.PrintDetails();
		System.out.println("===============================================");
		System.out.println();
		RAWAgent ref2 = new RAWAgent("B002", "Agent TOM", "Operation CHANAKYA");
		ref2.PrintDetails();
		System.out.println("===============================================");
		RAWAgent ref3 = new RAWAgent("C003", "Agent AKSHAY", "Operation BABY");
		ref3.PrintDetails();
		System.out.println("===============================================");
		RAWAgent ref4= new RAWAgent("D004", "Agent KING", "Operation QUEEN");
		ref4.setrawAgentBatchId("X004");//set/modify the agents batch id
		ref4.PrintDetails();
		System.out.println("===============================================");
		RAWAgent ref5= new RAWAgent("E005", "Agent SMITH", "Operation BALCKOUT");
		ref5.PrintDetails();
		System.out.println("===============================================");
		}
}

