# Arch-only stuff. Abort if not Arch.
[[ "$(cat /etc/issue 2> /dev/null)" =~ Arch ]] || return 1

# Package management
# TODO: Switch to pacman
#alias update="sudo apt-get -qq update && sudo apt-get upgrade"
#alias install="sudo apt-get install"
#alias remove="sudo apt-get remove"
#alias search="apt-cache search"
