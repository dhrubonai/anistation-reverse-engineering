package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jr5 {
    public static final jr5 x;
    public static final jr5 y;
    public static final /* synthetic */ jr5[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jr5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jr5] */
    static {
        ?? r0 = new Enum("THUMB", 0);
        x = r0;
        ?? r1 = new Enum("TRACK", 1);
        y = r1;
        z = new jr5[]{r0, r1};
    }

    public static jr5 valueOf(String str) {
        return (jr5) Enum.valueOf(jr5.class, str);
    }

    public static jr5[] values() {
        return (jr5[]) z.clone();
    }
}
