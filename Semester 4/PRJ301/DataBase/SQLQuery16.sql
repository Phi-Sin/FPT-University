CREATE DATABASE [LoginAccount] 

CREATE TABLE [dbo].[tblUser](
	[UserID] [nvarchar](50) NOT NULL,
	[FullName] [nvarchar](50) NULL,
	[Password] [nvarchar](50) NULL,
	[RoleID] [nvarchar](50) NULL,
 CONSTRAINT [PK_tblUser] PRIMARY KEY CLUSTERED 
(
	[userID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[tblUser] ([UserID], [FullName], [Password], [RoleID]) VALUES (N'AD001', N'Anthony Ortiz', N'123', N'AD')
INSERT [dbo].[tblUser] ([UserID], [FullName], [Password], [RoleID]) VALUES (N'AD004', N'Julian Santiago', N'234', N'AD')
INSERT [dbo].[tblUser] ([UserID], [FullName], [Password], [RoleID]) VALUES (N'US002', N'Joey Anderson', N'345', N'US')
INSERT [dbo].[tblUser] ([UserID], [FullName], [Password], [RoleID]) VALUES (N'US0088', N'Gregory Guzman', N'456', N'US')
INSERT [dbo].[tblUser] ([UserID], [FullName], [Password], [RoleID]) VALUES (N'US0089', N'Elizabeth Owens', N'567', N'US')

