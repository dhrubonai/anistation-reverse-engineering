.class public Lcom/google/firebase/auth/ActionCodeSettings;
.super Lc5/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/auth/ActionCodeSettings$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/firebase/auth/ActionCodeSettings;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:Ljava/lang/String;

.field private final zzc:Ljava/lang/String;

.field private final zzd:Ljava/lang/String;

.field private final zze:Z

.field private final zzf:Ljava/lang/String;

.field private final zzg:Z

.field private zzh:Ljava/lang/String;

.field private zzi:I

.field private zzj:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/firebase/auth/zzc;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/firebase/auth/zzc;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/firebase/auth/ActionCodeSettings;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>(Lcom/google/firebase/auth/ActionCodeSettings$Builder;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lc5/a;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/google/firebase/auth/ActionCodeSettings$Builder;->zze(Lcom/google/firebase/auth/ActionCodeSettings$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zza:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/google/firebase/auth/ActionCodeSettings$Builder;->zzd(Lcom/google/firebase/auth/ActionCodeSettings$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzb:Ljava/lang/String;

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzc:Ljava/lang/String;

    .line 6
    invoke-static {p1}, Lcom/google/firebase/auth/ActionCodeSettings$Builder;->zzb(Lcom/google/firebase/auth/ActionCodeSettings$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzd:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Lcom/google/firebase/auth/ActionCodeSettings$Builder;->zzf(Lcom/google/firebase/auth/ActionCodeSettings$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zze:Z

    .line 8
    invoke-static {p1}, Lcom/google/firebase/auth/ActionCodeSettings$Builder;->zza(Lcom/google/firebase/auth/ActionCodeSettings$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzf:Ljava/lang/String;

    .line 9
    invoke-static {p1}, Lcom/google/firebase/auth/ActionCodeSettings$Builder;->zzg(Lcom/google/firebase/auth/ActionCodeSettings$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzg:Z

    .line 10
    invoke-static {p1}, Lcom/google/firebase/auth/ActionCodeSettings$Builder;->zzc(Lcom/google/firebase/auth/ActionCodeSettings$Builder;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzj:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/firebase/auth/ActionCodeSettings$Builder;Lcom/google/firebase/auth/zza;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/firebase/auth/ActionCodeSettings;-><init>(Lcom/google/firebase/auth/ActionCodeSettings$Builder;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Lc5/a;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zza:Ljava/lang/String;

    .line 13
    iput-object p2, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzb:Ljava/lang/String;

    .line 14
    iput-object p3, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzc:Ljava/lang/String;

    .line 15
    iput-object p4, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzd:Ljava/lang/String;

    .line 16
    iput-boolean p5, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zze:Z

    .line 17
    iput-object p6, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzf:Ljava/lang/String;

    .line 18
    iput-boolean p7, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzg:Z

    .line 19
    iput-object p8, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzh:Ljava/lang/String;

    .line 20
    iput p9, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzi:I

    .line 21
    iput-object p10, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzj:Ljava/lang/String;

    return-void
.end method

.method public static newBuilder()Lcom/google/firebase/auth/ActionCodeSettings$Builder;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/firebase/auth/ActionCodeSettings$Builder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/google/firebase/auth/ActionCodeSettings$Builder;-><init>(Lcom/google/firebase/auth/zzb;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static zzb()Lcom/google/firebase/auth/ActionCodeSettings;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/firebase/auth/ActionCodeSettings;

    .line 2
    .line 3
    new-instance v1, Lcom/google/firebase/auth/ActionCodeSettings$Builder;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2}, Lcom/google/firebase/auth/ActionCodeSettings$Builder;-><init>(Lcom/google/firebase/auth/zzb;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/google/firebase/auth/ActionCodeSettings;-><init>(Lcom/google/firebase/auth/ActionCodeSettings$Builder;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method


# virtual methods
.method public canHandleCodeInApp()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzg:Z

    .line 2
    .line 3
    return v0
.end method

.method public getAndroidInstallApp()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zze:Z

    .line 2
    .line 3
    return v0
.end method

.method public getAndroidMinimumVersion()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzf:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getAndroidPackageName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzd:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getIOSBundle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzb:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zza:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    const/16 p2, 0x4f45

    .line 2
    .line 3
    invoke-static {p2, p1}, Lp7/a0;->t0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0}, Lcom/google/firebase/auth/ActionCodeSettings;->getUrl()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    invoke-virtual {p0}, Lcom/google/firebase/auth/ActionCodeSettings;->getIOSBundle()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    iget-object v1, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzc:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x4

    .line 31
    invoke-virtual {p0}, Lcom/google/firebase/auth/ActionCodeSettings;->getAndroidPackageName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x5

    .line 39
    invoke-virtual {p0}, Lcom/google/firebase/auth/ActionCodeSettings;->getAndroidInstallApp()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-static {p1, v0, v1}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x6

    .line 47
    invoke-virtual {p0}, Lcom/google/firebase/auth/ActionCodeSettings;->getAndroidMinimumVersion()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x7

    .line 55
    invoke-virtual {p0}, Lcom/google/firebase/auth/ActionCodeSettings;->canHandleCodeInApp()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-static {p1, v0, v1}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 60
    .line 61
    .line 62
    const/16 v0, 0x8

    .line 63
    .line 64
    iget-object v1, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzh:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const/16 v0, 0x9

    .line 70
    .line 71
    iget v1, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzi:I

    .line 72
    .line 73
    invoke-static {p1, v0, v1}, Lp7/a0;->h0(Landroid/os/Parcel;II)V

    .line 74
    .line 75
    .line 76
    const/16 v0, 0xa

    .line 77
    .line 78
    iget-object v1, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzj:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    invoke-static {p2, p1}, Lp7/a0;->u0(ILandroid/os/Parcel;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final zza()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzi:I

    return v0
.end method

.method public final zza(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzi:I

    return-void
.end method

.method public final zza(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzh:Ljava/lang/String;

    return-void
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzj:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzc:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zze()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/auth/ActionCodeSettings;->zzh:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
