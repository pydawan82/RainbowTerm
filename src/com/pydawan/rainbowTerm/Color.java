package com.pydawan.rainbowTerm;

import static com.pydawan.rainbowTerm.SGRCodes.*;

/**
 * An enumration of the ANSI SGR colors.
 */
public enum Color {
    BLACK(FG_BLACK, BG_BLACK),
    DARK_RED(FG_DARK_RED, BG_DARK_RED),
    DARK_GREEN(FG_DARK_GREEN, BG_DARK_GREEN),
    DARK_YELLOW(FG_DARK_YELLOW, BG_DARK_YELLOW),
    DARK_BLUE(FG_DARK_BLUE, BG_DARK_BLUE),
    DARK_MAGENTA(FG_DARK_MAGENTA, BG_DARK_MAGENTA),
    DARK_CYAN(FG_DARK_CYAN, BG_DARK_CYAN),
    GRAY(FG_DARK_WHITE, BG_BLACK),

    BRIGHT_BLACK(FG_BRIGHT_BLACK, BG_BRIGHT_BLACK),
    BRIGHT_RED(FG_BRIGHT_RED, BG_BRIGHT_RED),
    BRIGHT_GREEN(FG_BRIGHT_GREEN, BG_BRIGHT_GREEN),
    BRIGHT_YELLOW(FG_BRIGHT_YELLOW, BG_BRIGHT_YELLOW),
    BRIGHT_BLUE(FG_BRIGHT_BLUE, BG_BRIGHT_BLUE),
    BRIGHT_MAGENTA(FG_BRIGHT_MAGENTA, BG_BRIGHT_MAGENTA),
    BRIGHT_CYAN(FG_BRIGHT_CYAN, BG_BRIGHT_CYAN),
    WHITE(FG_WHITE, BG_WHITE),
    ;


    /**
     * The SGR code associated with the foreground color.
     */
    final int fgCode;
    
    /**
     * The SGR code associated with the background color.
     */
    final int bgCode;

    Color(int fgCode, int bgCode) {
        this.fgCode = fgCode;
        this.bgCode = bgCode;
    }
}
