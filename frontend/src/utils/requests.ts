export const BASE_URL =
  process.env.REACT_APP_LOCALE === "PROD"
    ? process.env.REACT_APP_PROD_API
    : "http://localhost:8080";
