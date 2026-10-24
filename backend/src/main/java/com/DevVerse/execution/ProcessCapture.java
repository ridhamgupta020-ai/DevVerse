package com.DevVerse.execution;

public record ProcessCapture(int exitCode, String stdout, String stderr, boolean timedOut,
                             boolean outputTruncated, boolean processStarted, boolean memoryExceeded) { }
