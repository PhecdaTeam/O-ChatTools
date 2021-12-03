<h1 align="center">O-ChatTools 💬</h1>
<p align="center">
  <img alt="Version" src="https://img.shields.io/badge/version-1.0.0-blue.svg?cacheSeconds=2592000" />
  <img src="https://img.shields.io/badge/Java-%3E%3D8.0-blue.svg" />
  <img src="https://img.shields.io/badge/Spigot/Paper-%5E1.8.9%20%7C%7C%20%3E%3D1.8.0-blue.svg" />
  <a href="#" target="_blank">
    <img alt="License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" />
  </a>
</p>


## 🏠 [Homepage](https://github.com/Out69/O-Welcomer#readme)
Latest release: [Click This](https://github.com/PhecdaTeam/O-ChatTools/releases/tag/1.0)

O-ChatTools is a simple but even well written plugin for:
- Chat management
- Helpop    
- Word blocking

What are the permissives? You can set them yourself in the plugin config! 
You can add your blocking words in config!

### Commands:
- /chat cc/on/off
- /helpop

## Prerequisites

- Java >=8.0
- Spigot/Paper ^1.8.9 || >=1.8.0

## Install

1. Go to releases page [Click](https://github.com/PhecdaTeam/O-ChatTools/releases)
2. Download version of plugin that is compatible with your server version. (Assets section)
3. Move O-ChatTools.jar to your `/plugins` server directory.
4. Restart server
5. And voilà!

## Config
```yml

# Use %player% to tag a player #

###########################
#       Permissions       #
###########################
ChatManage: 'chat.manage'
HelpOpSee: 'helpop.see'
ChatBypass: 'chat.bypass'

###########################
#         Messages        #
###########################
ChatIsOn: '&9The is already turned &bon'
ChatIsOff: '&9The is already turned &boff'
ChatOff: '&9The chat was turned &boff &9by &b%player%'
ChatOn: '&9The chat was turned &bon &9by &b%player%'
ChatClear: '&9The chat was &bCleared &9by &b%player%'
ChatBlocked: '&9The chat is currently blocked!'
ChatPerm: '&9You dont have permissions to use this command!'
HelpOp: '&8[&c&lHelp&4&lOP&8] &7%player% &8>> &7'
HelpOpEmpty: '&9Helpop message cant be empty!'
HelpOpSent: '&9Your message is successfully sent'
ChatEmpty: '&9Use : &b/chat cc/on/off'
IllegalMessage: '&9Your message cant been sent because have a illegal words!'

###########################
#       BlockedWords      #
###########################
BlockedWords:
    - 'wrongword1'
    - 'wrongword2'
```

## Author

👤 **Out69**

* Website: https://oucik.xyz/
* Github: [@Out69](https://github.com/Out69)

## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page](https://github.com/Out69/O-ChatTools/issues). You can also take a look at the [contributing guide](@github.com:Out69/O-ChatTools/blob/master/CONTRIBUTING.md).

## Show your support

Give a ⭐️ if this project helped you!

***

*You need help? Feel free to dm me on discord Out#9999*
