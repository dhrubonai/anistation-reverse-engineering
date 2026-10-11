package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class as4 {
    public static final as4 x;
    public static final as4 y;
    public static final /* synthetic */ as4[] z;

    /* JADX WARN: Type inference failed for: r0v0, types: [as4, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [as4, java.lang.Enum] */
    static {
        ?? r0 = new Enum("EXACT", 0);
        x = r0;
        ?? r1 = new Enum("INEXACT", 1);
        y = r1;
        z = new as4[]{r0, r1};
    }

    public static as4 valueOf(String str) {
        return (as4) Enum.valueOf(as4.class, str);
    }

    public static as4[] values() {
        return (as4[]) z.clone();
    }
}
