.class public final Lcom/google/android/recaptcha/internal/zzaf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zza:Lcom/google/android/recaptcha/internal/zzaf;

.field private static final zzb:Ljava/lang/String;

.field private static final zzc:Lb5/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzaf;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzaf;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/recaptcha/internal/zzaf;->zza:Lcom/google/android/recaptcha/internal/zzaf;

    .line 7
    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/google/android/recaptcha/internal/zzaf;->zzb:Ljava/lang/String;

    .line 15
    .line 16
    sget-object v0, Lb5/e;->b:Lb5/e;

    .line 17
    .line 18
    sput-object v0, Lcom/google/android/recaptcha/internal/zzaf;->zzc:Lb5/e;

    .line 19
    .line 20
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final zza(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzaf;->zzc:Lb5/e;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lb5/e;->b(Landroid/content/Context;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    const/16 v0, 0x9

    .line 14
    .line 15
    if-eq p0, v0, :cond_0

    .line 16
    .line 17
    const-string p0, "ANDROID_ONPLAY"

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string p0, "ANDROID_OFFPLAY"

    .line 21
    .line 22
    return-object p0
.end method
