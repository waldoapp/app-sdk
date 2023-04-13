import Foundation

public func isInsideWaldo() -> Bool {
    return ProcessInfo.processInfo.environment["INSIDE_WALDO"] == "1"
}
