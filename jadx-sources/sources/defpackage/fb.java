package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fb {
    public static final fb x;
    public static final fb y;
    public static final /* synthetic */ fb[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, fb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, fb] */
    static {
        ?? r0 = new Enum("SHOW_ORIGINAL", 0);
        x = r0;
        ?? r1 = new Enum("SHOW_TRANSLATED", 1);
        y = r1;
        z = new fb[]{r0, r1};
    }

    public static fb valueOf(String str) {
        return (fb) Enum.valueOf(fb.class, str);
    }

    public static fb[] values() {
        return (fb[]) z.clone();
    }
}
