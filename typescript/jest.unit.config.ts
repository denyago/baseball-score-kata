/** @type {import('ts-jest').JestConfigWithTsJest} */
module.exports = {
    preset: "ts-jest",
    testEnvironment: "node",
    testMatch: ["**/tests/**/*.test.ts"],
    reporters: ["default", ["<rootDir>/reporter/reporter.js", {
        reportUrl: "http://192.168.223.6:9000/kata/report",
        teamName: "ts-team"
    }]]
};
