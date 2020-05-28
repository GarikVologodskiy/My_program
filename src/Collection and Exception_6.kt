fun engineStatus(engineNumber: Int): String {
    return try {
        rawEngineStatus(engineNumber)
    } catch (e: EngineNotFoundException) {
        "engine $engineNumber not found"
    } catch (e: SensorsMeltException) {
        "engine $engineNumber offline"
    }
    return "I don't know anything about space engines!"
}

fun rawEngineStatus(engineNumber: Int): String {

}
