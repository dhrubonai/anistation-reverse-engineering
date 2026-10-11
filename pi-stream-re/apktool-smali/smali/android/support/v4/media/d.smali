.class public final Landroid/support/v4/media/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/google/android/material/datepicker/k;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const v1, 0x7f0402d5

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0, v1}, Lq6/g;->e0(Landroid/content/Context;Ljava/lang/String;I)Landroid/util/TypedValue;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 18
    .line 19
    sget-object v1, Ls5/a;->k:[I

    .line 20
    .line 21
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x3

    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {p1, v1}, Landroidx/appcompat/widget/r;->b(Landroid/content/Context;I)Landroidx/appcompat/widget/r;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, p0, Landroid/support/v4/media/d;->a:Ljava/lang/Object;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {p1, v1}, Landroidx/appcompat/widget/r;->b(Landroid/content/Context;I)Landroidx/appcompat/widget/r;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iput-object v1, p0, Landroid/support/v4/media/d;->g:Ljava/lang/Object;

    .line 47
    .line 48
    const/4 v1, 0x2

    .line 49
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-static {p1, v1}, Landroidx/appcompat/widget/r;->b(Landroid/content/Context;I)Landroidx/appcompat/widget/r;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput-object v1, p0, Landroid/support/v4/media/d;->b:Ljava/lang/Object;

    .line 58
    .line 59
    const/4 v1, 0x4

    .line 60
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-static {p1, v1}, Landroidx/appcompat/widget/r;->b(Landroid/content/Context;I)Landroidx/appcompat/widget/r;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iput-object v1, p0, Landroid/support/v4/media/d;->c:Ljava/lang/Object;

    .line 69
    .line 70
    const/4 v1, 0x6

    .line 71
    invoke-static {p1, v0, v1}, Lp7/a0;->u(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const/16 v3, 0x8

    .line 76
    .line 77
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-static {p1, v3}, Landroidx/appcompat/widget/r;->b(Landroid/content/Context;I)Landroidx/appcompat/widget/r;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    iput-object v3, p0, Landroid/support/v4/media/d;->d:Ljava/lang/Object;

    .line 86
    .line 87
    const/4 v3, 0x7

    .line 88
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-static {p1, v3}, Landroidx/appcompat/widget/r;->b(Landroid/content/Context;I)Landroidx/appcompat/widget/r;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    iput-object v3, p0, Landroid/support/v4/media/d;->e:Ljava/lang/Object;

    .line 97
    .line 98
    const/16 v3, 0x9

    .line 99
    .line 100
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-static {p1, v2}, Landroidx/appcompat/widget/r;->b(Landroid/content/Context;I)Landroidx/appcompat/widget/r;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iput-object p1, p0, Landroid/support/v4/media/d;->f:Ljava/lang/Object;

    .line 109
    .line 110
    new-instance p1, Landroid/graphics/Paint;

    .line 111
    .line 112
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 113
    .line 114
    .line 115
    iput-object p1, p0, Landroid/support/v4/media/d;->h:Ljava/lang/Object;

    .line 116
    .line 117
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 125
    .line 126
    .line 127
    return-void
.end method
