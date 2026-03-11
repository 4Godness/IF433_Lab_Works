package oop_126847_ZahraAriestya.week06

class SmartHomeHub {
    private val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        for (device in devices) {
            when (device) {
                is Recordable -> device.startRecord()
                is SmartSpeaker -> device.playMusic("Sirine Peringatan")
            }
        }
    }
}