# audacity

Giving The Community A Common Platform Where Student's, Developers Together Can Showcase Their Work And Build Their Personal Portfolio. Feel Free To Share And Experience Everything Around Udacity

## What's Included?
<ol>
  <li>Hottest App Of The Day</li>
  <li>Challenges</li>
  <li>Quizzes</li>
  <li>Results</li>
</ol>

## Future Addons
<ol>
  <li>Git Integration</li>
  <li>Slack Channel</li>
  <li>Quizzes</li>
  <li>Popular Apps</li>
</ol>

## Maintainers
<ul>
  <li>Kshitij Suri</li>
  <li>pallab (Pallab Kalita)</li>
  <li>maddySmith (Maddala Krishnachaitanya)</li>
  <li>SABDAR SHAIK</li>
  <li>thisismenaseem</li>
  <li>Suhanshu Patel</li>
  <li>Mohan Cm</li>
</ul>

## Contributors
All Google Udacity Andriod Basics Scholars are eligible to Contribute.
Please Read The Contributing Guide <a href="https://github.com/UdacityAndroidBasicsScholarship/audacity/blob/branch2/contributing.md"> Here </a>

## How You Can Contribute? ##
### Creating a Fork

Just head over to the GitHub page and click the "Fork" button. It's just that simple. Once you've done that, you can use your favorite git client to clone your repo or just head straight to the command line:

```shell
# Clone your fork to your local machine
git clone git@github.com:USERNAME/FORKED-PROJECT.git
```

### Keeping Your Fork Up to Date ###

While this isn't an absolutely necessary step, if you plan on doing anything more than just a tiny quick fix, you'll want to make sure you keep your fork up to date by tracking the original "upstream" repo that you forked. To do this, you'll need to add a remote:

```shell
# Add 'upstream' repo to list of remotes
git remote add upstream https://github.com/UPSTREAM-USER/ORIGINAL-PROJECT.git

# Verify the new remote named 'upstream'
git remote -v
```

Whenever you want to update your fork with the latest upstream changes, you'll need to first fetch the upstream repo's branches and latest commits to bring them into your repository:

```shell
# Fetch from upstream remote
git fetch upstream

# View all branches, including those from upstream
git branch -va
```

Now, checkout your own master branch and merge the upstream repo's master branch:

```shell
# Checkout your master branch and merge upstream
git checkout master
git merge upstream/master
```

If there are no unique commits on the local master branch, git will simply perform a fast-forward. However, if you have been making changes on master (in the vast majority of cases you probably shouldn't be - [see the next section](#doing-your-work), you may have to deal with conflicts. When doing so, be careful to respect the changes made upstream.

Now, your local master branch is up-to-date with everything modified upstream.

## Doing Your Work

### Create a Branch
Whenever you begin work on a new feature or bugfix, it's important that you create a new branch. Not only is it proper git workflow, but it also keeps your changes organized and separated from the master branch so that you can easily submit and manage multiple pull requests for every task you complete.

To create a new branch and start working on it:

```shell
# Checkout the master branch - you want your new branch to come from master
git checkout master

# Create a new branch named newfeature (give your branch its own simple informative name)
git branch newfeature

# Switch to your new branch
git checkout newfeature
```

Now, go to town hacking away and making whatever changes you want to.

## Submitting a Pull Request

### Cleaning Up Your Work

Prior to submitting your pull request, you might want to do a few things to clean up your branch and make it as simple as possible for the original repo's maintainer to test, accept, and merge your work.

If any commits have been made to the upstream master branch, you should rebase your development branch so that merging it will be a simple fast-forward that won't require any conflict resolution work.

```shell
# Fetch upstream master and merge with your repo's master branch
git fetch upstream
git checkout master
git merge upstream/master

# If there were any new commits, rebase your development branch
git checkout newfeature
git rebase master
```

Now, it may be desirable to squash some of your smaller commits down into a small number of larger more cohesive commits. You can do this with an interactive rebase:

```shell
# Rebase all commits on your development branch
git checkout 
git rebase -i master
```

This will open up a text editor where you can specify which commits to squash.

### Submitting ###

Once you've committed and pushed all of your changes to GitHub, go to the page for your fork on GitHub, select your development branch, and click the pull request button. If you need to make any adjustments to your pull request, just push the updates to GitHub. Your pull request will automatically track the changes on your development branch and update.


**Wanna Contribute?**</br>
Feel Free To Fork The Repo And Request A PR.
