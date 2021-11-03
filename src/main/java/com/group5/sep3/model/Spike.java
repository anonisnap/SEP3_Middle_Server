package com.group5.sep3.model;

import com.group5.sep3.util.JsonHelper;

public class Spike {
	private String spikeName;

	public Spike(String spikeName) {
		this.spikeName = spikeName;
	}

	public String getSpikeName() {
		return spikeName;
	}

	public void setSpikeName(String spikeName) {
		this.spikeName = spikeName;
	}

	@Override
	public String toString() {
		return "Spike{" +
				"spikeName='" + spikeName + '\'' +
				'}';
	}

	public static Spike FromJson(String string) {
		return JsonHelper.FromJson(string, Spike.class);
	}
}
