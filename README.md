# tsx-java-15Apr2023

In order to access the web hook, we may first have to configure our github repo to activate the webhook for our service.

Open github repo -> Site settings -> Webhooks -> Then enter the url for project -> Submit 

This will activate our repo's webhook

In case the application is running on localhost then follow the steps

Click on this site https://ngrok.com/download

After downloading and installing ngrok

Open terminal then type

ngrok <Internet Protocol i.e Http> <PortNumber>

Then copy the Forwarding link and paste in the webhooks of your repo

You may then run the application and perform the pull push and other activities (make sure that you have selected all events in webhooks) you can check the console it will be printed.

You can also call all the events by passing the id (id is just the sequencial number of when the event had occured).


** Very limited information was available about the requirement