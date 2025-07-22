# HOW TO

### Getting GOOGLE_CLIENT_ID and GOOGLE_CLIENT_SECRET

1. Go to the [Google Cloud Console](https://console.cloud.google.com/).
2. Create a new project or select an existing one.
3. Navigate to "APIs & Services" > "Credentials".
4. Click on "Create Credentials" and select "OAuth client ID".
5. Configure the consent screen if prompted.
6. Select "Web application" as the application type.
7. Add authorized redirect URIs:
   - For local development: `http://localhost:8080/login/oauth2/code/google`
   - For production: `https://yourdomain.com/login/oauth2/code/google`
8. After creating, you will see your `GOOGLE_CLIENT_ID` and `GOOGLE_CLIENT_SECRET`. Copy these values.
9. Paste them into your `.env` file:
   ```env
   GOOGLE_CLIENT_ID=your_client_id
   GOOGLE_CLIENT_SECRET=your_client_secret
   ```

### Endpoints
- **Login**: `/login`
- **Logout**: `/logout`
- **User Info**: `/user`
