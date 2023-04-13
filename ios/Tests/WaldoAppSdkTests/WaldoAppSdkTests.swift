import XCTest
@testable import WaldoAppSdk

final class WaldoAppSdkTests: XCTestCase {
    func tesIsInsideWaldo() throws {
        // This is an example of a functional test case.
        // Use XCTAssert and related functions to verify your tests produce the correct
        // results.
        XCTAssertEqual(isInsideWaldo(), false)
    }
}
