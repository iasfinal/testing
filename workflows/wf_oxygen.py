from json_logic import jsonLogic
import sys
import json

def main():
	# Oxygen level in mm of [Normal = 75 - 100]
	rule1 = {"<=" : [{ "var" : "oxygen" }, 75 ]}

	rule2 = {"and":
					[
					{">" : [{ "var" : "oxygen" }, 75 ]},
					{"<=" : [{ "var" : "oxygen" }, 100 ]}
					]
	}
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

	data_oxy = {"oxy_level":float(data["oxygen"])}


	if jsonLogic(rule1, data_oxy) == True:
		print 'Service Requested:'
		print "give_oxygen"
	elif jsonLogic(rule2, data_oxy) == True:
		print 'Service Requested:'
		print "normal_oxygen"
	elif jsonLogic(rule3,data) == True:
		print 'Next Workflow to execute:'
		print '_bp'
	else:
		print 'Next Workflow to execute:'
		print "_triplet"

if __name__ == '__main__':
	main()