package com.github.bogdanovmn.cmdlineapp;

import org.apache.commons.cli.CommandLine;

public class CmdLineApp {
	private final CmdLineAppEntryPoint entryPoint;
	private final CommandLine cmdLineArgs;

	CmdLineApp(CmdLineAppEntryPoint entryPoint, CommandLine cmdLineArgs) {
		this.entryPoint = entryPoint;
		this.cmdLineArgs = cmdLineArgs;
	}

	public void run() throws Exception {
		this.entryPoint.execute(this.cmdLineArgs);
	}
}
