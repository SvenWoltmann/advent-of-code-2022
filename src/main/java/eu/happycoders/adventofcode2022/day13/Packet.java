package eu.happycoders.adventofcode2022.day13;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Interface for a packet.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
sealed interface Packet permits PacketList, PacketInteger {}
