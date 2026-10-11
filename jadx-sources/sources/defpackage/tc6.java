package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tc6 {
    public static final tc6 A;
    public static final /* synthetic */ tc6[] B;
    public static final tc6 x;
    public static final tc6 y;
    public static final tc6 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tc6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tc6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, tc6] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, tc6] */
    static {
        ?? r0 = new Enum("StartInput", 0);
        x = r0;
        ?? r1 = new Enum("StopInput", 1);
        y = r1;
        ?? r2 = new Enum("ShowKeyboard", 2);
        z = r2;
        ?? r3 = new Enum("HideKeyboard", 3);
        A = r3;
        B = new tc6[]{r0, r1, r2, r3};
    }

    public static tc6 valueOf(String str) {
        return (tc6) Enum.valueOf(tc6.class, str);
    }

    public static tc6[] values() {
        return (tc6[]) B.clone();
    }
}
