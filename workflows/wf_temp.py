from json_logic import jsonLogic
import sys
import json

def main():
	# Temp. in Fahrenheit [Normal = 98.6 - 100.4]
	rule1 = {"<=" : [{ "var" : "temp" }, 98.6 ]}

	rule2 = {"and":
					[
					{">" : [{ "var" : "temp" }, 98.6 ]},
					{"<=" : [{ "var" : "temp" }, 100.4 ]}
					]
	}

	# data = { "temp" : 50 }
	# data = { "temp" : 99 }
	# data = { "temp" : 500 }


	rule3 = {"and":
					[
					{">" : [{ "var" : "bp" }, 120 ]},
					{">" : [{ "var" : "oxygen" }, 100 ]},
				 	{">" : [{ "var" : "temp" }, 100.4 ]}
					]
	}



	data = sys.argv[1]

	try:
		data = json.loads(data)
	except Exception as e:
		print 'Error occured:',e

	data_temp = {"temp":float(data["temp"])}


	if jsonLogic(rule1, data_temp) == True:
		print 'Service Requested:'
		print "heat_up"
	elif jsonLogic(rule2, data_temp) == True:
		print 'Service Requested:'
		print "cool_down"
	elif jsonLogic(rule3,data) == True:
		print 'Next Workflow to execute:'
		print '_bp'
	else:
		print 'Next Workflow to execute:'
		print "_triplet"

if __name__ == '__main__':
	main()