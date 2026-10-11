package com.anistation.model.settings;

import defpackage.db;
import defpackage.q71;
import defpackage.qx1;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class SubtitleStyleSettings {
    public static final Companion Companion = new Companion(null);
    private static final SubtitleStyleSettings DEFAULT = new SubtitleStyleSettings(0.0f, 0.0f, 0.0f, 0, 0, null, false, 127, null);
    public static final float DEFAULT_FONT_SCALE = 1.0f;
    public static final float DEFAULT_OUTLINE_WIDTH_DP = 2.0f;
    public static final float DEFAULT_VERTICAL_POSITION = 0.9f;
    public static final float MAX_FONT_SCALE = 1.6f;
    public static final float MAX_OUTLINE_WIDTH_DP = 3.0f;
    public static final float MAX_VERTICAL_POSITION = 1.0f;
    public static final float MIN_FONT_SCALE = 0.7f;
    public static final float MIN_OUTLINE_WIDTH_DP = 0.0f;
    public static final float MIN_VERTICAL_POSITION = 0.55f;
    private final SubtitleFontFamily fontFamily;
    private final float fontScale;
    private final boolean isBold;
    private final int outlineColorArgb;
    private final float outlineWidthDp;
    private final int textColorArgb;
    private final float verticalPosition;

    public /* synthetic */ SubtitleStyleSettings(float f, float f2, float f3, int i, int i2, SubtitleFontFamily subtitleFontFamily, boolean z, int i3, q71 q71Var) {
        this((i3 & 1) != 0 ? 1.0f : f, (i3 & 2) != 0 ? 0.9f : f2, (i3 & 4) != 0 ? 2.0f : f3, (i3 & 8) != 0 ? -1 : i, (i3 & 16) != 0 ? SubtitleArgbColor.BLACK : i2, (i3 & 32) != 0 ? SubtitleFontFamily.DEFAULT : subtitleFontFamily, (i3 & 64) != 0 ? true : z);
    }

    public static /* synthetic */ SubtitleStyleSettings copy$default(SubtitleStyleSettings subtitleStyleSettings, float f, float f2, float f3, int i, int i2, SubtitleFontFamily subtitleFontFamily, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f = subtitleStyleSettings.fontScale;
        }
        if ((i3 & 2) != 0) {
            f2 = subtitleStyleSettings.verticalPosition;
        }
        if ((i3 & 4) != 0) {
            f3 = subtitleStyleSettings.outlineWidthDp;
        }
        if ((i3 & 8) != 0) {
            i = subtitleStyleSettings.textColorArgb;
        }
        if ((i3 & 16) != 0) {
            i2 = subtitleStyleSettings.outlineColorArgb;
        }
        if ((i3 & 32) != 0) {
            subtitleFontFamily = subtitleStyleSettings.fontFamily;
        }
        if ((i3 & 64) != 0) {
            z = subtitleStyleSettings.isBold;
        }
        SubtitleFontFamily subtitleFontFamily2 = subtitleFontFamily;
        boolean z2 = z;
        int i4 = i2;
        float f4 = f3;
        return subtitleStyleSettings.copy(f, f2, f4, i, i4, subtitleFontFamily2, z2);
    }

    public final float component1() {
        return this.fontScale;
    }

    public final float component2() {
        return this.verticalPosition;
    }

    public final float component3() {
        return this.outlineWidthDp;
    }

    public final int component4() {
        return this.textColorArgb;
    }

    public final int component5() {
        return this.outlineColorArgb;
    }

    public final SubtitleFontFamily component6() {
        return this.fontFamily;
    }

    public final boolean component7() {
        return this.isBold;
    }

    public final SubtitleStyleSettings copy(float f, float f2, float f3, int i, int i2, SubtitleFontFamily subtitleFontFamily, boolean z) {
        subtitleFontFamily.getClass();
        return new SubtitleStyleSettings(f, f2, f3, i, i2, subtitleFontFamily, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubtitleStyleSettings)) {
            return false;
        }
        SubtitleStyleSettings subtitleStyleSettings = (SubtitleStyleSettings) obj;
        if (Float.compare(this.fontScale, subtitleStyleSettings.fontScale) == 0 && Float.compare(this.verticalPosition, subtitleStyleSettings.verticalPosition) == 0 && Float.compare(this.outlineWidthDp, subtitleStyleSettings.outlineWidthDp) == 0 && this.textColorArgb == subtitleStyleSettings.textColorArgb && this.outlineColorArgb == subtitleStyleSettings.outlineColorArgb && this.fontFamily == subtitleStyleSettings.fontFamily && this.isBold == subtitleStyleSettings.isBold) {
            return true;
        }
        return false;
    }

    public final SubtitleFontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final float getFontScale() {
        return this.fontScale;
    }

    public final int getOutlineColorArgb() {
        return this.outlineColorArgb;
    }

    public final float getOutlineWidthDp() {
        return this.outlineWidthDp;
    }

    public final int getTextColorArgb() {
        return this.textColorArgb;
    }

    public final float getVerticalPosition() {
        return this.verticalPosition;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isBold) + ((this.fontFamily.hashCode() + qx1.c(this.outlineColorArgb, qx1.c(this.textColorArgb, qx1.b(this.outlineWidthDp, qx1.b(this.verticalPosition, Float.hashCode(this.fontScale) * 31, 31), 31), 31), 31)) * 31);
    }

    public final boolean isBold() {
        return this.isBold;
    }

    public final SubtitleStyleSettings normalized() {
        return copy$default(this, db.B(this.fontScale, 0.7f, 1.6f), db.B(this.verticalPosition, 0.55f, 1.0f), db.B(this.outlineWidthDp, 0.0f, 3.0f), 0, 0, null, false, 120, null);
    }

    public String toString() {
        float f = this.fontScale;
        float f2 = this.verticalPosition;
        float f3 = this.outlineWidthDp;
        int i = this.textColorArgb;
        int i2 = this.outlineColorArgb;
        SubtitleFontFamily subtitleFontFamily = this.fontFamily;
        boolean z = this.isBold;
        StringBuilder t = qx1.t("SubtitleStyleSettings(fontScale=", f, ", verticalPosition=", f2, ", outlineWidthDp=");
        t.append(f3);
        t.append(", textColorArgb=");
        t.append(i);
        t.append(", outlineColorArgb=");
        t.append(i2);
        t.append(", fontFamily=");
        t.append(subtitleFontFamily);
        t.append(", isBold=");
        return qx1.r(t, z, ")");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final SubtitleStyleSettings getDEFAULT() {
            return SubtitleStyleSettings.DEFAULT;
        }

        private Companion() {
        }
    }

    public SubtitleStyleSettings(float f, float f2, float f3, int i, int i2, SubtitleFontFamily subtitleFontFamily, boolean z) {
        subtitleFontFamily.getClass();
        this.fontScale = f;
        this.verticalPosition = f2;
        this.outlineWidthDp = f3;
        this.textColorArgb = i;
        this.outlineColorArgb = i2;
        this.fontFamily = subtitleFontFamily;
        this.isBold = z;
    }

    public SubtitleStyleSettings() {
        this(0.0f, 0.0f, 0.0f, 0, 0, null, false, 127, null);
    }
}
