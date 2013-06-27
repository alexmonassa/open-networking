Open Networking Contributing Guide
==============================

Basic Steps
-----------

To contribute to Open Networking, fork the core repository to your own Git, clone your fork, commit your work on topic branches, and make pull requests.

If you don't have the Git client (`git`), get it from: <http://git-scm.com/>

Here are the steps in detail:

1. [Fork](https://github.com/forge/core/fork) the project. This creates a the project in your own Git with the default remote name 'origin'.

2. Clone your fork. This creates and populates a directory in your local file system.

        git clone git@github.com:<your-username>/open-networking.git

3. Add the remote `upstream` repository so you can fetch any changes to the original forked repository.

        git remote add upstream git@github.com:gujavasc/open-networking.git

4. Get the latest files from the `upstream` repository.

        git fetch upstream

5. Create a new topic branch to contain your features, changes, or fixes using the `git checkout -b  <topic-branch-name> upstream/master` command. For example:

        git checkout -b feature/security upstream/master

6. Contribute new code or make changes to existing files. If you're using Eclipse, be sure to format your code using the Eclipse Code Formatter.

7. Use the `git add` command to add new or changed file contents to the staging area.
        git add .

8. Use the git status command to view the status of the files in the directory and in the staging area and ensure that all modified files are properly staged:

        git status

9. Commit your changes to your local topic branch.

        git commit -m 'Issue #12: Description of change...'

10. If you made multiple commits, or if there were any merge commits created when you pulled from upstream, use rebase to squash them into a single commit, where 5 is the number of commits to rebase:

        git rebase -i HEAD~5

    Change 'pick' to 'f' for each commit you wish to fixup upwards. (If you do not change a line, it will not be modified.)

        1 pick ade2b1a Implemented XYZ
        2 f c3ae0a2 almost done
        3 f c863bfb did more work
        4 f af793ae Started working on ABC
        5 pick 368bbb9 Previous commit written by someone else

    Once you are done, your commits should look like this:

        1 ade2b1a Implemented XYZ
        2 368bbb9 Previous commit written by someone else

    You can view your commits by typing:

        git log

11. Push your local topic branch to your github forked repository. This will create a branch on your Git fork repository with the same name as your local topic branch name.

        git push origin HEAD

   _Note: The above command assumes your remote repository is named 'origin'. You can verify your forked remote repository name using the command `git remote -v`_.

12. Browse to the <topic-branch-name> branch on your forked Git repository and [open a Pull Request](http://help.github.com/send-pull-requests/). Give it a clear title and description.

