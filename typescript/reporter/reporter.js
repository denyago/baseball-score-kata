"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const axios_1 = require("axios");
class JestReporter {
    constructor(globalConfig, options) {
        this._globalConfig = globalConfig;
        this._options = options;
    }
    onTestResult(test, testResult, aggregatedResults) {
        this._lastTest = testResult.testResults.slice(-1)[0].fullName;
    }
    onRunComplete(test, runResults) {
        try {
            const response = axios_1.default.post(this._options?.reportUrl, `${this._options?.teamName},${runResults?.numFailedTests},${runResults?.numPassedTests},${this._lastTest}`);
        }
        catch (error) {
            console.log(`Error reporting to ${this._options?.reportUrl}`);
        }
    }
}
exports.default = JestReporter;
