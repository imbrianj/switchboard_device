/**
 * Universal Controller Interface
 *
 * Author: brian@bevey.org
 * Date: 2014-5-6
 *
 * Used in conjunction with the Universal Controller, this allows you to
 * control properly configured devices from SmartThings.
 */

metadata {
  definition (name: "Universal Controller", namespace: "imbrian", author: "Brian J.") {
    command "sam_poweroff"
    command "sam_up"
    command "sam_down"
    command "sam_left"
    command "sam_enter"
    command "sam_right"
    command "sam_chup"
    command "sam_chdown"
    command "sam_volup"
    command "sam_voldown"
    command "sam_mute"
    command "sam_smarthub"
    command "sam_return"
    command "sam_link"

    command "ps3-up"
    command "ps3-down"
    command "ps3-left"
    command "ps3-right"
    command "ps3-poweron"
    command "ps3-ps"
    command "ps3-select"
    command "ps3-start"
    command "ps3-triangle"
    command "ps3-square"
    command "ps3-circle"
    command "ps3-cross"
  }

  tiles {
    // SAMSUNG
    standardTile("sam_poweroff", "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "sam_poweroff", label: "Power Off", action: "sam_poweroff", icon: ""
    }

    standardTile("sam_up",       "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "sam_up", label: "up", action: "sam_up", icon: ""
    }

    standardTile("sam_smarthub", "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "sam_smarthub", label: "SmartHub", action: "sam_smarthub", icon: ""
    }

    standardTile("sam_left",     "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "sam_left", label: "left", action: "sam_left", icon: ""
    }

    standardTile("sam_enter",    "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "sam_enter", label: "Enter", action: "sam_enter", icon: ""
    }
    
    standardTile("sam_right",    "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "sam_right", label: "right", action: "sam_right", icon: ""
    }

    standardTile("sam_chdown",   "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "sam_chdown", label: "Ch Down", action: "sam_chdown", icon: ""
    }

    standardTile("sam_down",     "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "sam_down", label: "down", action: "sam_down", icon: ""
    }

    standardTile("sam_chup",     "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "sam_chup", label: "Ch Up", action: "sam_chup", icon: ""
    }

    standardTile("sam_mute",     "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "sam_mute", label: "Mute", action: "sam_mute", icon: ""
    }

    standardTile("sam_voldown",  "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "sam_voldown", label: "Vol Down", action: "sam_voldown", icon: ""
    }

    standardTile("sam_volup",    "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "sam_volup", label: "Vol Up", action: "sam_volup", icon: ""
    }

    standardTile("sam_return",   "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "sam_return", label: "Return", action: "sam_return", icon: ""
    }

    standardTile("sam_link",     "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "sam_link", label: "Link", action: "sam_link", icon: ""
    }

    // PS3
    standardTile("ps3-poweron",  "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "ps3-poweron", label: "Power On", action: "ps3-poweron", icon: ""
    }

    standardTile("ps3-up",       "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "ps3-up", label: "up", action: "ps3-up", icon: ""
    }

    standardTile("ps3-ps",       "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "ps3-ps", label: "PS", action: "ps3-ps", icon: ""
    }

    standardTile("ps3-left",     "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "ps3-left", label: "left", action: "ps3-left", icon: ""
    }

    standardTile("ps3-cross",    "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "ps3-cross", label: "Cross", action: "ps3-cross", icon: ""
    }
    
    standardTile("ps3-right",    "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "ps3-right", label: "right", action: "ps3-right", icon: ""
    }

    standardTile("ps3-select",   "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "ps3-select", label: "Select", action: "ps3-select", icon: ""
    }

    standardTile("ps3-down",     "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "ps3-down", label: "down", action: "ps3-down", icon: ""
    }

    standardTile("ps3-start",    "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "ps3-start", label: "Start", action: "ps3-start", icon: ""
    }

    standardTile("ps3-triangle", "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "ps3-triangle", label: "Triangle", action: "ps3-triangle", icon: ""
    }

    standardTile("ps3-circle",   "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "ps3-circle", label: "Circle", action: "ps3-circle", icon: ""
    }

    standardTile("ps3-square",   "device.image", width: 1, height: 1, canChangeIcon: false, canChangeBackground: false, decoration: "flat") {
      state "ps3-square", label: "Square", action: "ps3-square", icon: ""
    }

    standardTile("blank", "device.image", width: 1, height: 1, canChangeIcon: false,  canChangeBackground: false, decoration: "flat") {
      state "pause", label: "", action: "pause", icon: ""
    }

    main "sam_poweroff"

    details(["sam_poweroff", "sam_up", "sam_smarthub", "sam_left", "sam_enter", "sam_right", "sam_chdown", "sam_down", "sam_chup", "sam_mute", "sam_voldown", "sam_volup", "sam_return", "sam_link", "blank", "ps3-poweron", "ps3-up", "ps3-ps", "ps3-left", "ps3-cross", "ps3-right", "ps3-select", "ps3-down", "ps3-start", "ps3-triangle", "ps3-circle", "ps3-square"])
  }
}

// SAMSUNG
def sam_powerof() {
  api("samsung", "POWEROFF")
}

def sam_up() {
  api("samsung", "UP")
}

def sam_smarthub() {
  api("samsung", "CONTENTS")
}

def sam_left() {
  api("samsung", "LEFT")
}

def sam_enter() {
  api("samsung", "ENTER")
}

def sam_right() {
  api("samsung", "RIGHT")
}

def sam_chdown() {
  api("samsung", "CHDOWN")
}

def sam_down() {
  api("samsung", "DOWN")
}

def sam_chup() {
  api("samsung", "CHUP")
}

def sam_mute() {
  api("samsung", "MUTE")
}

def sam_voldown() {
  api("samsung", "VOLDOWN")
}

def sam_volup() {
  api("samsung", "VOLUP")
}

def sam_return() {
  api("samsung", "RETURN")
}

def sam_link() {
  api("samsung", "HDMI4,DOWN,ENTER")
}

// PS3
def ps3_poweron() {
  api("ps3", "PowerOn")
}

def ps3_up() {
  api("ps3", "Up")
}

def ps3_ps() {
  api("ps3", "PS")
}

def ps3_left() {
  api("ps3", "Left")
}

def ps3_cross() {
  api("ps3", "Cross")
}

def ps3_right() {
  api("ps3", "Right")
}

def ps3_select() {
  api("ps3", "Select")
}

def ps3_down() {
  api("ps3", "Down")
}

def ps3_start() {
  api("ps3", "Start")
}

def ps3_triangle() {
  api("ps3", "Triangle")
}

def ps3_circle() {
  api("ps3", "Circle")
}

def ps3_square() {
  api("ps3", "Square")
}

private api(device, command) {
  log.debug("Executing ${command}")

  def uri = "/?${device}=${command}"

  def hubAction = new physicalgraph.device.HubAction(
    method: "GET",
    path: uri,
    headers: [HOST:getHostAddress()]
  )

  hubAction
}

//helper methods
private Integer convertHexToInt(hex) {
  Integer.parseInt(hex,16)
}

private String convertHexToIP(hex) {
  [convertHexToInt(hex[0..1]),convertHexToInt(hex[2..3]),convertHexToInt(hex[4..5]),convertHexToInt(hex[6..7])].join(".")
}

private getHostAddress() {
  def parts = device.deviceNetworkId.split(":")
  def ip = convertHexToIP(parts[0])
  def port = convertHexToInt(parts[1])
  return ip + ":" + port
}