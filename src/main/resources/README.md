## Project Name & Description :

  "Cosmolady is a retail e-commerce beauty expert application where we offer a wide range of beauty services and cosmetic products, 
   tailored to meet the needs of our customers for their convenience."


## Installation Instructions: 
 
 1.0  Clone the repository to your local machine:   git clone <git url>
 
 2.0  Pull the code in your local repository: git pull origin master
 
 3.0  If necessary, build maven dependencies in your pom.xml file as per your environment
 

## Usage: 

1.0 Right click on project run as springboot app in Spring Tool Suite IDE.

2.0 Application started on tomcat by default 8080 port. If necessary you can change port number in your
    application.properties file.
	
3.0 Check out necessary steps to write your test cases.

4.0 List of jason bodies and API are privided you can find it in this file. Please look for it.


## API Contracts: 

# 1.0 Roles:
  
  
  
	1.0.1:-
    
	    API        : addroles
		Method     : POST
		RequestBody: 
				   {
		            "name": "Admin",
                    "permissions": [
                                   {
                                    "name": "users"
                                   },
                                   {
                                    "name": "categories"
                                   },
                                   {
                                   "name": "brands"
                                   },
                                   {
                                   "name": "products"
                                   },
                                   {
                                   "name": "customers"
                                   },
                                   {
                                   "name": "articles"
                                   },
                                   {
                                   "name": "menus"
                                   },
                                   {
                                   "name": "settings"
                                   },
                                   {
                                   "name": "orders"
                                   }
                                  ]
		              }
		
		ResponseBody: 
				   {
				    "id"  : 1,
		            "name": "Admin",
                    "permissions": [
                                   {
                                    "name": "users"
                                   },
                                   {
                                    "name": "categories"
                                   },
                                   {
                                   "name": "brands"
                                   },
                                   {
                                   "name": "products"
                                   },
                                   {
                                   "name": "customers"
                                   },
                                   {
                                   "name": "articles"
                                   },
                                   {
                                   "name": "menus"
                                   },
                                   {
                                   "name": "settings"
                                   },
                                   {
                                   "name": "orders"
                                   }
                                  ]
		              }


    1.0.2:-
	
	    API         : getroles
		Method      : GET
		RequestParam: role           
		ResponseBody:-
		             [
                      "users",
                      "categories",
                      "brands",
                      "products",
                      "customers",
                      "articles",
                      "menus",
                      "settings",
                      "orders"
                      ]
	
# --------------------------------------------------------------------------------------------------------------------------#
		
# 2.0: Users 	
		
		API        : addusers
		Method     : POST
		RequestBody:-
		           {
                     "fname": "John",
                     "lname": "Doe",
                     "email": "johndoe@example.com",
                     "userName": "johndoe",
                     "mobile": "1234567890"
                    }
		ResponseBody:-
		            {
                     "fname": "John",
                     "lname": "Doe",
                     "email": "johndoe@example.com",
                     "userName": "johndoe",
                     "mobile": "1234567890"
                    }
     

# ----------------------------------------------------------------------------------------------------------------------------#

# 3.0 HairCut:
	
  3.0.1 API     	: add-cut
		Method  	: Post
		RequestBody :
			{
				"haircutType" : "V-cut",
				"price"       : 100,
				"description" : "The V-shaped haircut is a popular look, especially for long hair. Instead of having even tips, your hair is cut into layers 
								on ends forming a “V”, which you can best show off when you let 
								your hair down.It’s a refreshing way to add dimension to your hair.",
				"image"       : null,
				"service"     : null
			}
			
		Response:
			{
				"id"          : 1,
				"haircutType" : "V-cut",
				"price"       : 100,
				"description" : "The V-shaped haircut is a popular look, especially for long hair. Instead of having even tips, your hair is cut into layers 
								on ends forming a “V”, which you can best show off when you let 
								your hair down.It’s a refreshing way to add dimension to your hair.",
				"image"       : null,
				"service"     : null
			}
     
	   
	        
  3.0.2 API     : get-cut
		Method  : Get
		Response:
			{
				"id"          : 1,
				"haircutType" : "V-cut",
				"price"       : 100,
				"description" : "The V-shaped haircut is a popular look, especially for long hair. Instead of having even tips, your hair is cut into layers 
								on ends forming a “V”, which you can best show off when you let 
								your hair down.It’s a refreshing way to add dimension to your hair.",
				"image"       : null,
				"service"     : null
			}
			
			
  3.0.3 API     	: get-specialcut
		Method  	: Get
		RequestParam: cut
		Response	:
				V-cut1,100,The V-shaped haircut is a popular look, especially for long hair.
				Instead of having even tips, your hair is cut into layers on ends forming a “V”,
				which you can best show off when you let your hair down.
				It’s a refreshing way to add dimension to your hair.,null
			
			
			
			
  3.0.4 API     	: update-cut
		Method  	: Put
		RequestBody :
			{
				"id"          : 1,
				"haircutType" : "V-cut",
				"price"       : 200,
				"description" : "The V-shaped haircut is a popular look, especially for long hair. Instead of having even tips, your hair is cut into layers 
								on ends forming a “V”, which you can best show off when you let 
								your hair down.It’s a refreshing way to add dimension to your hair.",
				"image"       : null,
				"service"     : null
			}
			
		Response:
			{
				"id"          : 1,
				"haircutType" : "V-cut",
				"price"       : 200,
				"description" : "The V-shaped haircut is a popular look, especially for long hair. Instead of having even tips, your hair is cut into layers 
								on ends forming a “V”, which you can best show off when you let 
								your hair down.It’s a refreshing way to add dimension to your hair.",
				"image"       : null,
				"service"     : null
			}
			
			
  3.0.5 API     	: delete-cut
		Method  	: DELETE
		PathVariable: id
			
		
	
#------------------------------------------------------------------------------------------------------------------------------#

# 4.0 Center:
	
  4.0.1 API     	: add-center
		Method  	: Post
		RequestBody :
			{
				"center": "Nagpur",
				"branch": "Hudkeshwar",
				"address": "Plot no. 49, Shyam Nagar, Near St.Paul School, Hudkeshwar Road, Nagpur - 440034"
			}
			
		Response:
			{
				"id": 1,
				"center": "Nagpur",
				"branch": "Hudkeshwar",
				"address": "Plot no. 49, Shyam Nagar, Near St.Paul School, Hudkeshwar Road, Nagpur - 440034"
			}
			
			
  4.0.2 API     	: get-center
		Method  	: Get	
		Response:
			{
				"id": 1,
				"center": "Nagpur",
				"branch": "Hudkeshwar",
				"address": "Plot no. 49, Shyam Nagar, Near St.Paul School, Hudkeshwar Road, Nagpur - 440034"
			}
			
			
  4.0.3 API     	: get-branch
		Method  	: Get	
		RequestParam: center
		Response:
			[
				"2,Flat no. 405, Wing B, Manish Nagar, Pimpri Chinchwad, Pune - 440012,Pimpri Chinchwad,Pune",
				"6,Shop no. 601,Sai Enclave, Trisharan Nagar, Pimple Saudagar, Pune - 440015,Pimple Saudagar,Pune"
			]
			
			
  4.0.4 API     	: change-center
		Method  	: Put
		RequestBody :
			{
				"id": 1,
				"center": "Nagpur",
				"branch": "Hudkeshwar Branch",
				"address": "Plot no. 49, Shyam Nagar, Near St.Paul School, Hudkeshwar Road, Nagpur - 440034"
			}
			
		Response:
			{
				"id": 1,
				"center": "Nagpur",
				"branch": "Hudkeshwar Branch",
				"address": "Plot no. 49, Shyam Nagar, Near St.Paul School, Hudkeshwar Road, Nagpur - 440034"
			}
			
			
#------------------------------------------------------------------------------------------------------------------------------#			

# 5.0 HairColor:
	
  5.0.1 API     	: add-color
		Method  	: Post
		RequestBody :
			{
				"color": "Darkest Brown",
				"price": 300
			}
			
		Response:
			{
				"id": 1,
				"color": "Darkest Brown",
				"price": 300
			}
			
			
     	
  5.0.2 API     	: get-color
		Method  	: Get
		Response    :
			{
				"id": 1,
				"color": "Darkest Brown",
				"price": 300
			}
     	
	
  5.0.3 API     	: update-color
		Method  	: Put
		RequestBody :
			{
				"id": 1,
				"color": "Darkest Brown",
				"price": 400
			}
			
		Response:
			{
				"id": 1,
				"color": "Darkest Brown",
				"price": 400
			}
             


#----------------------------------------------------------------------------------------------------------------------------#

#6.0 MakeUp:

    1.0 API			:add-makeup
		Method		:Post
		RequestBody :
            {
				"makeUpName"	:"no makeup look",
				"price"  		:500,
				"discountPer"	:3
            }
       Response:
			{
				"id"			:1,
				"makeUpName"	:"no makeup look",
				"price"  		:500,
				"discountPer"	:3
            }


	2.0	API		:get-makeup
		Method	:Get
		Response:     
            {
				"id"
				"makeUpName"	:"no makeup look",
				"price"  		:500,
				"discountPer"	:3
            }

    3.0 API			:update-makeup
		Method		:Put
		RequestBody :
            {
				"id"			:1,
				"makeUpName"	:"no makeup look",
				"price"  		:500,
				"discountPer"	:3
            }
       Response	:
			{
				"id"			:1,
				"makeUpName"	:"no makeup look",
				"price"  		:500,
				"discountPer"	:3
            }

	4.0	API			:saw
		Method		:Get
		RequestParam:MakeUpName
		Response	:no makeup look,500,4 
		
	
	5.0	API			:exp
		Method		:Get
		RequestParam:price
		Response	:no makeup look

 #------------------------------------------------------------------------------------------------------------------------------------------------    


#7.0 HairSpa:-

	1.0	API			:add-spa
		Method		:Post
		RequestBody	:
			{
                "spaName":"for oily hair",
                "price" :300
            }
		Response	:
			{
				"id"	 :1,
                "spaName":"for oily hair",
                "price"  :300
            }

	2.0	API		:get-spa
		Method	:Get
		Response:
			{
				"id"	 :1,
                "spaName":"for oily hair",
                "price"  :300
            }
                
	
	3.0	API			:update-spa
		Method		:Put
		RequestBody	:
			{
                "id"	 :1,
                "spaName":"for hair fall",
                "price"  :350
            }
		Response	:
			{
				"id"	 :1,
                "spaName":"for hair fall",
                "price"  :350
            }

 #-----------------------------------------------------------------------------------------------------------------------------------------------------------        
                   

## Contributing

We welcome contributions from the community to make Project Name even better! If you'd like to contribute, please follow these guidelines:

1. Fork the repository and create a new branch.
2. Make your changes and test them thoroughly.
3. Submit a pull request, describing the changes you've made and any relevant information.

For reporting issues or suggesting improvements, please open an issue on the repository page.

## License

Project Name is licensed under the [Cosmolady License].This is nor opensource platform. 
           
			
			







			 

   