package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wg5 {
    public static final wg5 x;
    public static final /* synthetic */ wg5[] y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wg5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wg5] */
    static {
        ?? r0 = new Enum("EditableText", 0);
        x = r0;
        y = new wg5[]{r0, new Enum("StaticText", 1)};
    }

    public static wg5 valueOf(String str) {
        return (wg5) Enum.valueOf(wg5.class, str);
    }

    public static wg5[] values() {
        return (wg5[]) y.clone();
    }
}
