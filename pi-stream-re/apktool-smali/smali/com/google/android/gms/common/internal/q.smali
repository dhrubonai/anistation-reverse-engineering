.class public final Lcom/google/android/gms/common/internal/q;
.super Lc5/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/internal/q;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:J

.field public final e:J

.field public final f:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:I

.field public final z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/y;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/y;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/common/internal/q;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc5/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/google/android/gms/common/internal/q;->a:I

    .line 5
    .line 6
    iput p2, p0, Lcom/google/android/gms/common/internal/q;->b:I

    .line 7
    .line 8
    iput p3, p0, Lcom/google/android/gms/common/internal/q;->c:I

    .line 9
    .line 10
    iput-wide p4, p0, Lcom/google/android/gms/common/internal/q;->d:J

    .line 11
    .line 12
    iput-wide p6, p0, Lcom/google/android/gms/common/internal/q;->e:J

    .line 13
    .line 14
    iput-object p8, p0, Lcom/google/android/gms/common/internal/q;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p9, p0, Lcom/google/android/gms/common/internal/q;->x:Ljava/lang/String;

    .line 17
    .line 18
    iput p10, p0, Lcom/google/android/gms/common/internal/q;->y:I

    .line 19
    .line 20
    iput p11, p0, Lcom/google/android/gms/common/internal/q;->z:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
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
    iget v1, p0, Lcom/google/android/gms/common/internal/q;->a:I

    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Lp7/a0;->h0(Landroid/os/Parcel;II)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    iget v1, p0, Lcom/google/android/gms/common/internal/q;->b:I

    .line 15
    .line 16
    invoke-static {p1, v0, v1}, Lp7/a0;->h0(Landroid/os/Parcel;II)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    iget v1, p0, Lcom/google/android/gms/common/internal/q;->c:I

    .line 21
    .line 22
    invoke-static {p1, v0, v1}, Lp7/a0;->h0(Landroid/os/Parcel;II)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    iget-wide v1, p0, Lcom/google/android/gms/common/internal/q;->d:J

    .line 27
    .line 28
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->k0(Landroid/os/Parcel;IJ)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x5

    .line 32
    iget-wide v1, p0, Lcom/google/android/gms/common/internal/q;->e:J

    .line 33
    .line 34
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->k0(Landroid/os/Parcel;IJ)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x6

    .line 38
    iget-object v1, p0, Lcom/google/android/gms/common/internal/q;->f:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x7

    .line 45
    iget-object v1, p0, Lcom/google/android/gms/common/internal/q;->x:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {p1, v0, v1, v2}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    const/16 v0, 0x8

    .line 51
    .line 52
    iget v1, p0, Lcom/google/android/gms/common/internal/q;->y:I

    .line 53
    .line 54
    invoke-static {p1, v0, v1}, Lp7/a0;->h0(Landroid/os/Parcel;II)V

    .line 55
    .line 56
    .line 57
    const/16 v0, 0x9

    .line 58
    .line 59
    iget v1, p0, Lcom/google/android/gms/common/internal/q;->z:I

    .line 60
    .line 61
    invoke-static {p1, v0, v1}, Lp7/a0;->h0(Landroid/os/Parcel;II)V

    .line 62
    .line 63
    .line 64
    invoke-static {p2, p1}, Lp7/a0;->u0(ILandroid/os/Parcel;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
