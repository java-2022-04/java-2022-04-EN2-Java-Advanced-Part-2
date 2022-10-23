### Share and collaborate your projects with github
**Tasks**
1. Reassemble in your game project teams using the breakout rooms.
2. Choose one of your team mates to connect to github (sharing the screen).
3. In the command line, navigate to the root directory of your game project.
6. Create/Initialise your local git repo and commit your game project to your local git repository. Use the following command to have your main branch called main.

``git init -b main``
5. Create a .gitignore file and add all files and folders to it that you do not want to share.
6. Create an initial commit to your local repository.
7. Login to your GitHub account (website).
8. At the top right of any Github page, you should see a '+' icon. Click that, then select 'New Repository'.
9. Give your repository a name--ideally the same name as your local game project. If I'm building a travel application, its folder will be called 'travel-app' on my computer, and 'travel-app' will be the Github repository name as well.
10. Click 'Create Repository'. The next screen you see will be important, so don't close it.
11. The screen you should be seeing now on Github is titled 'Quick setup — if you’ve done this kind of thing before'. Copy the link in the input right beneath the title, it should look something like this: https://github.com/yourname/yourproject.git 
This is the web address that your local folder will use to push its contents to the remote folder on Github.
12. Go back to your project in the terminal/command line. In your terminal/command line, type: 

``git remote add origin [copied web address] ``

(Example: git remote add origin https://github.com/yourname/yourproject.git)

13. Create token (classic) https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token#creating-a-personal-access-token-classic
14. Push your branch to Github using your username and generated token as password: 

``git push -u origin main``

15. Set your upstream project with the following command

``git push --set-upstream origin main``

16. Check on Github website if your project is there. Congratulation you have shared your first project on github ;)!
17. Now since you uploaded your game-project to gitHub invite your team mates using the steps from here: https://docs.github.com/en/account-and-profile/setting-up-and-managing-your-personal-account-on-github/managing-access-to-your-personal-repositories/inviting-collaborators-to-a-personal-repository
18. (Other team mates) Those team members who have now access also need to create a access token (classic) https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token#creating-a-personal-access-token-classic
19. (Other team mates) Navigate to a directory on you computer, where you want to checkout the game-project to (preferably NOT within one of your game project copies ;) and clone the game project. (GitHub website green button "Code") Use the following command.

``git clone [copied web address]`` 
20. (Other team mates) If that worked, make some changes to one of the files within that project and commit them to your local repository.
21. (Other team mates) Use git push to also have the changes on your github repository.

``git push -u origin main``

**Streched tasks**
1. Only if you finished early, try to understand and use "Fork" and PullRequest
