ECHO getting submodules

cd ~/git/j4pulse/j4pulse
git submodule init
git submodule update
git submodule foreach git checkout master
git submodule foreach git pull origin master