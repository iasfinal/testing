from json_logic import jsonLogic
import sys
import json

def main():
	# Considering Systolic Pressure only
	rule1 = {"<=" : [{ "var" : "bp" }, 90 ]}

	rule2 = {"and":
					[
					{">" : [{ "var" : "bp" }, 90 ]},
					{"<=" : [{ "var" : "bp" }, 120 ]}				
					]
	}

	# data = { "bp" : 40 }
	# data = { "bp" : 100 }

	rule3 = {"and":
					[
					{">" : [{ "var" : "bp" }, 120 ]},
					{">" : [{ "var" : "oxygen" }, 100 ]},
				 	{">" : [{ "var" : "temp" }, 100.4 ]}
					]
	}
																																																																																																																					# data = '{ "bp" : 99, "temp" : 5000, "xyz":455}'

	data = sys.argv[1];

	try:
		data = json.loads(data)
	except Exception as e:
		print 'Error occured:',e

	data_bp={"bp":float(data["bp"])}


	if jsonLogic(rule1, data_bp) == True:
		print 'Service Requested:'
		print "take_high_medicine"
	elif jsonLogic(rule2, data_bp) == True:
		print 'Service Requested:'
		print "take_low_medicine"
	elif jsonLogic(rule3,data) == True:
		print 'Next Workflow to execute:'
		print '_temp'
	else:
		print 'Next Workflow to execute:'
		print "_triplet"

if __name__ == '__main__':
	main()